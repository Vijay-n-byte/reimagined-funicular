import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SampleserviceService } from 'src/app/services/sampleservice.service';

@Component({
  selector: 'app-adminhomemanager',
  templateUrl: './adminhomemanager.component.html',
  styleUrls: ['./adminhomemanager.component.css']
})
export class AdminhomemanagerComponent implements OnInit {

  public k:any;
  op="modalbackground1";
  constructor(private g:SampleserviceService,private j:Router){}
  openmodel="modal";
  r:number;
  w:any;
  ngOnInit(): void {
    this.g.getallcustomercredentials().subscribe(n=>{
      if(n!=null){
        this.w=n;
      }
    });
  }
  openmodal(){
    this.op="modalbackground";
  }
  closemodal(){
    this.op="modalbackground1";
    this.j.navigateByUrl('/',{skipLocationChange:true}).then(()=>{
      this.j.navigate(['/adminpage/customeredit'])
    });
  }
  submitvalue(){
    // console.log(n.value);
  }

}
