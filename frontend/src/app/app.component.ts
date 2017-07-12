import { Const } from './const/const.component';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./css/style.css']
})
export class AppComponent {
  router: Router;
  urlList;

  constructor(router: Router) {
    this.urlList = Const.URL;
    this.router = router;
  }

  moveScreen(url: string) {
    this.router.navigateByUrl(url);
  }
}
