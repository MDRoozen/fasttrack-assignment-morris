import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HolidayComponent } from './domainEntities/holiday/holiday.component';
import { HttpClientModule } from "@angular/common/http";
import { NewHolidayComponent } from './new-holiday/new-holiday.component';
import { EmployeeComponent } from './domainEntities/employee/employee.component';

@NgModule({
  declarations: [
    AppComponent,
    HolidayComponent,
    NewHolidayComponent,
    EmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
