import {Component, inject} from '@angular/core';
import {FormsModule} from "@angular/forms";
import {NgbAlert, NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {ModalTesterComponent} from "./modal-tester/modal-tester.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule, NgbAlert],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'kata-frontend';
  private modalService = inject(NgbModal);
  result!: string;

  openTesterModal() {
    const modalRef = this.modalService.open(ModalTesterComponent);
    modalRef.result.then((result) => {
      this.result = result;
    }).catch((reason) => {
      console.log('Fermeture de la modal');
    });
  }
}
