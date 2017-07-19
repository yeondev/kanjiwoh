import { Const } from './const/const.component';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./css/style.css']
})
export class AppComponent {
  _router: Router;
  urlList;

  constructor(private router: Router) {
    this.urlList = Const.URL;
    this._router = router;
    console.log('app.component loaded');
  }

  moveScreen(url: string) {
    this._router.navigateByUrl(url);
  }
}
