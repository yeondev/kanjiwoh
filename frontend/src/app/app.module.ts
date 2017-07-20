import { AppComponent } from './app.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { InputComponent } from './components/input.component';
import { StudyComponent } from './components/study.component';
import { HttpRequestService } from './services/http-request.service';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path: 'input', component: InputComponent},
  {path: 'study', component: StudyComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    InputComponent,
    StudyComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule],
  providers: [HttpRequestService],
  bootstrap: [AppComponent]
})
export class AppModule { }
