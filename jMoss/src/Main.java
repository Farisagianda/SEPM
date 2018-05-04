class Main      //test
{
 public static void main(String[] args)
 {
  Fitzroy f = new Fitzroy();
  f.openFile();
  f.readFile();
  f.closeFile();
  
  Lilydale l = new Lilydale();
  l.openFile();
  l.readFile();
  l.closeFile();
  
  MelbourneCBD m = new MelbourneCBD();
  m.openFile();
  m.readFile();
  m.closeFile();
  
  St_Kilda s = new St_Kilda();
  s.openFile();
  s.readFile();
  s.closeFile();
  
  Sunshine shine = new Sunshine();
  shine.openFile();
  shine.readFile();
  shine.closeFile();
 }
}