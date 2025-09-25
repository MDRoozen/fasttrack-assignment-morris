import {HolidayModel} from "./holiday.model";

export interface EmployeeModel {
  id: string,
  name :string,
  holidays: HolidayModel[]
}
