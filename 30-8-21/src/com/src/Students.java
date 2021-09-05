package com.src;

public class Students implements Comparable {
    int sid;
    String sname;
    String sadd;
    int smat;
    int ssci;
    int ssoc;
    int total;
    public String  toString()
 {
 return "ID:"+sid+" NAME:"+sname+" ADDRESS:"+sadd+" MATHMARKS:"+smat+" SCIENCEMARKS:"+ssci+" SOCIALMARKS:"+ssoc;
 }
public Students(int sid, String sname, String sadd, int smat, int ssci, int ssoc) {
this.sid=sid;
  this.sname=sname;
  this.sadd=sadd;
  this.smat=smat;
  this.ssci=ssci;
  this.ssoc=ssoc;
  total=smat+ssci+ssoc;

}
@Override
public int compareTo(Object o) {
Students s1=(Students)o;
if(this.total<s1.total || this.total==s1.total && this.smat<s1.smat || this.total==s1.total && this.ssci<s1.ssci || this.total==s1.total && this.ssoc<s1.ssoc)
{
 return -1;
}
else if(this.total>this.total || this.total==s1.total && this.smat>s1.smat || this.total==s1.total && this.ssci>s1.ssci || this.total==s1.total && this.ssoc>s1.ssoc)
{
return 1;
}
else
{
return 0;
}
}

}

