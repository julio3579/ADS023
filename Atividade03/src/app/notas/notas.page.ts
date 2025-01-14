import { NotasService } from './notas.service';
import { Nota } from './nota.model';

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-notas',
  templateUrl: './notas.page.html',
  styleUrls: ['./notas.page.scss'],
})
export class NotasPage implements OnInit {

  titulo: string = 'Suas notas';

  notas: Nota[];

  constructor(private notasService: NotasService) { }

  ngOnInit() {
    this.notas = this.notasService.getNotas();
  }

}
