package com.test.compositeMode;

class Folder extends  Component{
    Component[] files ;  //既可以放文件File类，也可以放文件夹Folder类。Folder类下又有子文件或子文件夹。
    String foldername ;
    public Folder(Component[] source){ files = source ;}

    public void scan(){
        for ( Component f:files){
            if ( f instanceof File){
                System.out.println("File "+((File) f).filename);
            }else if(f instanceof Folder){
                Folder e = (Folder)f ;
                System.out.println("Folder "+e.foldername);
                e.scan();
            }
        }
    }
    
}