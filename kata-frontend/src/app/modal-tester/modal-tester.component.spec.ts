import {ComponentFixture, TestBed} from '@angular/core/testing';

import {ModalTesterComponent} from './modal-tester.component';

describe('ModalTesterComponent', () => {
  let component: ModalTesterComponent;
  let fixture: ComponentFixture<ModalTesterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ModalTesterComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModalTesterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
