import {inject, Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class EngineService {
  private httpClient = inject(HttpClient);
  private readonly PATH = environment.API_PATH;

  calculate(input: number): Observable<string> {
    return this.httpClient
      .get(`${this.PATH}foobarquix?value=${input}`, { responseType: 'text' });
  }
}
