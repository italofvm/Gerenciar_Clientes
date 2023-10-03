import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Cliente } from "../modelo/Cliente";

@Injectable({
  providedIn: "root",
})
export class ClienteService {
  // Url da API
  private url: string =
    "http://root:sfond3S8IQpnxvkc1i3R@containers-us-west-157.railway.app";

  // Construtor
  constructor(private http: HttpClient) {}

  // Método para selecionar todos os clientes
  selecionar(): Observable<Cliente[]> {
    return this.http.get<Cliente[]>(this.url);
  }

  // Método para cadastrar clientes
  cadastrar(obj: Cliente): Observable<Cliente> {
    return this.http.post<Cliente>(this.url, obj);
  }

  // Método para editar clientes
  editar(obj: Cliente): Observable<Cliente> {
    return this.http.put<Cliente>(this.url, obj);
  }

  // Método para remover clientes
  remover(codigo: number): Observable<void> {
    return this.http.delete<void>(this.url + "/" + codigo);
  }
}
