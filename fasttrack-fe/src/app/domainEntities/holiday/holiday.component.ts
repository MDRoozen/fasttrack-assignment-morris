import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-holiday',
  templateUrl: './holiday.component.html',
  styleUrls: ['./holiday.component.scss']
})
export class HolidayComponent {

  @Input()
  label: string = "";

  @Input()
  status: string = "";

  @Input()
  employee: string = "";

}
