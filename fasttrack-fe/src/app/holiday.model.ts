export interface HolidayModel {
  uuid: string;
  label: string;
  employeeId: string;
  startOfHoliday: Date;
  endOfHoliday: Date;
  status: string;
}
