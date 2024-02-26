import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CategoriaService } from './services/categoria/categoria.service';
import { ClientesService } from './services/clientes/clientes.service';
import { EmpleadoService } from './services/empleado/empleado.service';
import { OrdenService } from './services/orden/orden.service';
import { OrdendetService } from './services/ordendet/ordendet.service';
import { ProductosService } from './services/productos/productos.service';
import { ProveedoresService } from './services/proveedores/proveedores.service';
import { TransportistasService } from './services/transportistas/transportistas.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  categoriaForm: FormGroup; 

  constructor(
    public fb: FormBuilder,
    public categoriaService: CategoriaService,
    public clientesService: ClientesService,
    public empleadoService: EmpleadoService,
    public ordenService: OrdenService,
    public ordendetService: OrdendetService,
    public productosService: ProductosService,
    public proveedoresService: ProveedoresService,
    public transportistasService: TransportistasService
    ){

    }
    ngOnInit():void{
      this.categoriaForm = this.fb.group({
        nombre : ['', Validators.required],
        descripcion :['', Validators.required],
    })
      }

      guardar(): void{

      }
      
    }
