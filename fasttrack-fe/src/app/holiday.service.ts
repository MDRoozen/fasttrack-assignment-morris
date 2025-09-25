import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";
import { HolidayModel } from "./holiday.model";

@Injectable({
  providedIn: 'root'
})
export class HolidayService {

  constructor(private readonly httpClient: HttpClient) {
  }

  public getHolidays(): Observable<HolidayModel[]> {
    return this.httpClient.get<HolidayModel[]>("http://localhost:8080/holidays");
  }

  public getHolidaysForEmployee(employeeCode: string): Observable<HolidayModel[]> {
    return this.httpClient.get<HolidayModel[]>("https://localhost:8080/holidays/" + employeeCode)
  }
}
