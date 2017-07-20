import { Injectable } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs';

@Injectable()
export class HttpRequestService {

  jsonHeader = {
    'Content-Type': 'application/json',
    'Accept': 'application/json',
    'Access-Control-Allow-Headers': 'Content-Type',
  };

  constructor(private http: Http) {
    console.log('httpRequestService ready');
  }

  getContentTemplates() {
    const headerObj = {
      header: new Headers(this.jsonHeader)
    };
    return this.http.get('/api/template/get', headerObj);
  }

  insertWordData(wordForm: any) {
    console.log(wordForm)
    const headerObj = {
      header: new Headers(this.jsonHeader)
    };
    return this.http.post('/api/word/add', wordForm, headerObj)
  }
}
