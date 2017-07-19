import { Injectable } from '@angular/core';
import { Http, Headers } from '@angular/http';

@Injectable()
export class HttpRequestService {

  jsonHeader = {
    'Content-Type': 'application/json',
    'Accept': 'application/json',
    'Access-Control-Allow-Headers': 'Content-Type',
  }

  constructor(private http: Http) {
    console.log('httpRequestService ready');
  }

  getContentTemplates() {
    const headerObj = {
      header: new Headers(this.jsonHeader)
    };
    return this.http.get('/api/template/get', headerObj);
  }
}
