
var a =[21,25,29,28,22,24,27,26,23];
for (let i=0;i<a.length;i++){

	for(let j=i+1;j<a.length;j++){

	if(a[i]>a[j])
	    {
		    let temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
	    }
	
	}
	}

	for(let i=0;i<a.length-1;i++){
			if(a[i]+1!=a[i+1])
			{
			console.log( a[i]+1); 
            break;
			}
			else if(a[i]+1==a[i+1]&&a[i]+1==a[a.length-1])
			{
			   			console.log( a[i]+2); 
 
			}
	}  
  