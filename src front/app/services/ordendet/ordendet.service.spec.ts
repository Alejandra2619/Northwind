import { TestBed } from '@angular/core/testing';

import { OrdendetService } from './ordendet.service';

describe('OrdendetService', () => {
  let service: OrdendetService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OrdendetService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
