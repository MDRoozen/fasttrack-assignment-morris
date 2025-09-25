import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {EmployeeModel} from "./employee.model";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private readonly http: HttpClient) { }

  public getEmployees(): Observable<EmployeeModel[]> {

    return this.http.get<EmployeeModel[]>("http://localhost:8080/employees");
  }
}
