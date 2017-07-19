import { HttpRequestService } from '../services/http-request.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-input-component',
  templateUrl: './input.component.html',
  styleUrls: ['../css/style.css']
})
export class InputComponent implements OnInit {
  templateObject;
  errMsg;

  ngOnInit(): void {
    this.getContentTemplates();
  }

  constructor(private httpRequestService: HttpRequestService) {
  }

  getContentTemplates() {
    this.httpRequestService.getContentTemplates()
      .subscribe(
        data => {
         this.templateObject = data.json(); 
        },
        err => this.errMsg,
        () => {
          console.log(this.templateObject);
        }
      );
  }

}
