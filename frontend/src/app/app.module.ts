import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { InputComponent } from './components/input.component';
import { StudyComponent } from './components/study.component';
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
    HttpModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
