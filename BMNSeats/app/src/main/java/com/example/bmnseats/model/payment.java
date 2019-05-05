package com.example.bmnseats.model;

public class payment {
      private String Ac_Number;
      private String Ac_Name;

      public payment()
      {

      }
      public payment(String Ac_Number,String Ac_Name)
      {

          this.Ac_Number=Ac_Number;
          this.Ac_Name=Ac_Name;

      }

    public String getAc_Number() {
        return Ac_Number;
    }

    public void setAc_Number(String ac_Number) {
        Ac_Number = ac_Number;
    }

    public String getAc_Name() {
        return Ac_Name;
    }

    public void setAc_Name(String ac_Name) {
        Ac_Name = ac_Name;
    }
}
