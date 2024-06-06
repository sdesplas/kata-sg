import {Component, inject} from '@angular/core';
import {NgbActiveModal} from "@ng-bootstrap/ng-bootstrap";
import {EngineService} from "../services/engine.service";
import {take} from "rxjs";
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-modal-tester',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './modal-tester.component.html',
  styleUrl: './modal-tester.component.css'
})
export class ModalTesterComponent {
  activeModal = inject(NgbActiveModal);
  engineService = inject(EngineService);
  nombre: number = 0;
  isNombreValid: boolean = false;

  calculate() {
    if(this.nombre) {
      this.engineService.calculate(this.nombre)
        .pipe(take(1)).subscribe((r) => {
          this.activeModal.close(r);
      })
    }
  }

  checkNombre() {
    this.isNombreValid = this.nombre >= 1 && this.nombre <= 100;
  }
}
