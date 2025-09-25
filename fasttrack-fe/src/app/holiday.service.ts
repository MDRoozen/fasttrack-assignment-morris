import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { HolidayModel } from "./holiday.model";

@Injectable({
  providedIn: 'root'
})
export class HolidayService {

  private readonly baseUrl: string = "http://localhost:8080/holidays";

  constructor(private readonly httpClient: HttpClient) {
  }

  public getHolidays(): Observable<HolidayModel[]> {
    return this.httpClient.get<HolidayModel[]>(this.baseUrl);
  }

  public getHolidaysForEmployee(employeeCode: string): Observable<HolidayModel[]> {
    return this.httpClient.get<HolidayModel[]>(this.baseUrl + employeeCode)
  }

  public postHoliday(holiday: HolidayModel): void {
    this.httpClient.post(this.baseUrl, holiday);
  }

  public deleteHoliday(uuid: string): void {
    this.httpClient.delete(this.baseUrl + uuid)
  }
}
