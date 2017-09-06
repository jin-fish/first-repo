import java.util.Map
import java.util.HashMap
/*
 将数组的每个元素做为HashMap的key，它的索引作为value保存，HashMap查找时间复杂度为O(1)
 */
class TwoSum
{
	public int[] sum(int[] arr,int target){
		int[] result=new int[2];
		Map<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<arr.len;++i){
			if(map.containsKey(target-arr[i]))
			{
				result[1]=i;
				result[0]=map.get(target-arr[i]);

				return result;
			}

			map.put(arr[i],i);
		}

		return result;

	}
		
}
