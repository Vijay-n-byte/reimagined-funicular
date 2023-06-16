import { HttpClient, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ilogin } from '../interfaces/ilogin';

import { Customer } from '../interfaces/customer';
import { Customerdetails } from '../interfaces/customerdetails';

import { Assigni } from '../interfaces/assigni';

@Injectable({
  providedIn: 'root'
})
export class SampleserviceService {
  data:Ilogin;
  user:string;
  customerid:number;
  totalprice:number;

  userm:string;
  usere:string;
 

  constructor(private http:HttpClient) { }

  private api1:string="http://localhost:8080/login/customer/";
  private api2:string="http://localhost:8080/customer/";
  private api3:string="http://localhost:8080/customer";
  private api4:string="http://localhost:8080/login/manager/";
  private api5:string="http://localhost:8080/manager";
  private api6:string="http://localhost:8080/login/engineer/";
  private api7:string="http://localhost:8080/engineer/";
  private api8:string="http://localhost:8080/engineer";
  private api9:string="http://localhost:8080/login/admin/";
  private api10:string="http://localhost:8080/admin/customer";
  
  
  
  set(n:string){
    this.user=n;
  }
  get():string{
    return this.user;
  }

  setm(n:string){
    this.userm=n;
  }
  getm():string{
    return this.userm;
  }

  sete(n:string){
    this.usere=n;
  }
  gete():string{
    return this.usere;
  }

  getclogincredentials(username:string):Observable<Ilogin | null> | null {
    let y=this.api1+username;
    let z=this.http.get<Ilogin>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  getalogincredentials(username:string):Observable<Ilogin | null> | null {
    let y=this.api9+username;
    let z=this.http.get<Ilogin>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  getmlogincredentials(username:string):Observable<Ilogin | null> | null {
    let y=this.api4+username;
    let z=this.http.get<Ilogin>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  getelogincredentials(username:string):Observable<Ilogin | null> | null {
    let y=this.api6+username;
    let z=this.http.get<Ilogin>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  getcustomerspecific():Observable<Ilogin | null> | null {
    let y=this.api2+this.user;
    let z=this.http.get<any>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  getmanagerspecific():Observable<any| null> | null {
    let y=this.api5;
    let z=this.http.get<any>(y);
  //  z.subscribe(m=>this.data=m);
    return z;
  }

  getengineerspecific():Observable<any | null> | null {
    let y=this.api7+this.usere;
    let z=this.http.get<any>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  postcomplaints(b):Observable<any|null>|null{
    console.log(b);
   // return null;
    return this.http.post<any>(this.api3,b);

  }

  postassigndetails(i:string,hj:number):Observable<any|null>|null{
    let d:Assigni={
      ticketnumber:hj,
      username:i
    }
    console.log(d);
    return this.http.post<Assigni>(this.api5,d); 
  }

  poststatusdetails(hj:number):Observable<any|null>|null{
    let d:Assigni={
      ticketnumber:hj,
      username:this.usere
    }
    console.log(d);
    return this.http.post<Assigni>(this.api8,d); 
  }

  getallcustomercredentials():Observable<any | null> | null {
    let y=this.api10;
    let z=this.http.get<Ilogin>(y);
    return z;
  }

  postnewcustomerdetails(hj:any):Observable<any|null>|null{
    return this.http.post<Assigni>(this.api10,hj); 
  }
  

}

