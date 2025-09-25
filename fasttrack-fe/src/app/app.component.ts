import { Component } from '@angular/core';
import {HolidayService} from "./holiday.service";
import {HolidayModel} from "./holiday.model";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'fasttrack-fe';
  holidays: HolidayModel[] = [];

  constructor(private readonly holidayService: HolidayService) {}

  ngOnInit(): void {
    this.holidayService.getHolidays().subscribe({
        next: value => this.holidays = value
    })
  }

}
