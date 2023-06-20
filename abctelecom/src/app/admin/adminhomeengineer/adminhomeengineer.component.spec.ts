import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminhomeengineerComponent } from './adminhomeengineer.component';

describe('AdminhomeengineerComponent', () => {
  let component: AdminhomeengineerComponent;
  let fixture: ComponentFixture<AdminhomeengineerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdminhomeengineerComponent]
    });
    fixture = TestBed.createComponent(AdminhomeengineerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
