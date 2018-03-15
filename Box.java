class Box{
	int length=1;
	int height=1;
	int width=1;
		
		
		{
		
	

	length=2;
     width=2;
	 height=2;
		
		
		
	
		}
		
		Box(){
			length=3;
			width=3;
			height=3;
			
			
			
			}
		
	
		
		
		
	Box(int w,int h,int l){
		
		width=w;
		height=h;
		length=l;
		
		//System.out.println("Box(int,int,int)");
	
		
		}
	
	/*void add_value(int w,int h,int l){
		width=w;
		height=h;
		length=l;
		*/
	void volume(){
		int volume=width*height*length;
	
		 System.out.println("volume is: "+volume);
			
		
		
	}
	

	void area(){
		int area=width*length*6;
		System.out.println("Area is:"+area);
		
		}
	
	}

