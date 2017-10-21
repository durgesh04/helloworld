object BinarySearch
{
		def binsearch(set:Array[Int], srno: Int,l:Int,r:Int) :Int =
	  	{
			var mid=(l+r)/2
			if(l>r)
			 {
				return -1;
			}
			else if(set(mid)==srno)
				{
				return mid
				}

			else if(set(mid)>srno)
				{
				binsearch(set,srno,l,mid-1)
				}

			else
				{
				binsearch(set,srno,mid+1,r)
				}
		}

		def main(args:Array[String])
		{
			println("Enter no of elements in array: ")
			var n:Int=Console.readInt

			var set= new Array[Int](n)

			println("Now enter array elements: ")
			for(i <- 0 to n-1) 
			{
			 set(i)=Console.readInt
			}

			set=set.sorted
			println("Enter number to be searched for: ")
			var srno=Console.readInt

			var posn:Int=binsearch(set,srno,0,n-1)
			if(posn == -1)
			{
			 println("Not found")
			}
			else
			{
			 println("Found at position "+(posn+1)+" in sorted array")
			}
		}
	}
