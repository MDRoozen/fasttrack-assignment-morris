import { TestBed } from '@angular/core/testing';

import { HolidayService } from './holiday.service';
import { HttpClientTestingModule } from "@angular/common/http/testing";

describe('HolidayService', () => {
  let service: HolidayService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
    });
    service = TestBed.inject(HolidayService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
