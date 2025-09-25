import { Component, Input } from '@angular/core';
import { HolidayModel } from "../../holiday.model";

@Component({
  selector: 'app-holiday',
  templateUrl: './holiday.component.html',
  styleUrls: ['./holiday.component.scss']
})
export class HolidayComponent {

  @Input()
  holiday: HolidayModel;

}
