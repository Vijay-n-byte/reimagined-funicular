import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminhomemanagerComponent } from './adminhomemanager.component';

describe('AdminhomemanagerComponent', () => {
  let component: AdminhomemanagerComponent;
  let fixture: ComponentFixture<AdminhomemanagerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdminhomemanagerComponent]
    });
    fixture = TestBed.createComponent(AdminhomemanagerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
