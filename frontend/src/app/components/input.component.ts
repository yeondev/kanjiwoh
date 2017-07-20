import { HttpRequestService } from '../services/http-request.service';
import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, FormArray, Validators } from '@angular/forms';
import { ArrayTypeNode } from 'typescript';

@Component({
  selector: 'app-input-component',
  templateUrl: './input.component.html',
  styleUrls: ['../css/style.css']
})
export class InputComponent implements OnInit {
  wordGroupObject;
  templateObject;
  wordForm: FormGroup;
  initComplete;
  errMsg;

  ngOnInit(): void {
    this.getContentTemplates();

    this.wordForm = this.formBuilder.group({
        groupName: [''],
        wordList: this.formBuilder.array([
          this.initWordRow()
        ])
    });
    
    this.initComplete = true;
  }
  
  private initWordRow() {
      return this.formBuilder.group({
        word: ['', [Validators.required]],
        hiragana: [''],
        means: ['']
      });
  }

  constructor(private httpRequestService: HttpRequestService,
             private formBuilder: FormBuilder) {
  }

  addRow() {
        const arrayControl = <FormArray>this.wordForm.controls['wordList'];
        arrayControl.push(this.initWordRow());
  }
  
  removeRow(index: number) {
        const control = <FormArray>this.wordForm.controls['wordList'];
        control.removeAt(index);
  }
  getContentTemplates() {
    this.httpRequestService.getContentTemplates()
      .subscribe(
        data => {
         this.templateObject = data.json(); 
        },
        err => this.errMsg,
        () => {
          console.log('get template complete');
          console.log(this.templateObject);
        }
      );
  }
  onSubmit() {
    this.httpRequestService.insertWordData(this.wordForm.value)
      .subscribe(
        data => {
         this.wordGroupObject = data.json();
        },
        err => this.errMsg,
        () => {
          console.log('submit completed');
          console.log(this.wordGroupObject);
        }
      );
  }

}
