import {TestBed} from '@angular/core/testing';
import {HttpClientTestingModule, HttpTestingController} from '@angular/common/http/testing';
import {EngineService} from './engine.service';

describe('EngineService', () => {
  let service: EngineService;
  let httpMock: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [EngineService]
    });

    service = TestBed.inject(EngineService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  afterEach(() => {
    httpMock.verify();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should call calculate and return expected result', () => {
    const mockResult = 'FOO';
    const input = 42;

    service.calculate(input).subscribe(result => {
      expect(result).toBe(mockResult);
    });

    const req = httpMock.expectOne(`${service['PATH']}foobarquix?value=${input}`);
    expect(req.request.method).toBe('GET');
    req.flush(mockResult);
  });
});
