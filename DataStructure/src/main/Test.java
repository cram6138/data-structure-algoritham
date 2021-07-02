package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
	public static List<Sample> samlist = new ArrayList<Test.Sample>();
	static {
		samlist.add(new Sample("A", "B", "C", "v1", "v2", "v3"));
		samlist.add(new Sample("A", "B", "C", "v4", "v5", "v6"));
		samlist.add(new Sample("A", "B", "C", "v7", "v8", "v9"));
		samlist.add(new Sample("A", "B", "C", "v10", "v11", "v12"));
		samlist.add(new Sample("A1", "B1", "C1", "v1", "v2", "v3"));
		samlist.add(new Sample("A1", "B1", "C1", "v11", "v21", "v31"));
		samlist.add(new Sample("A1", "B1", "C1", "v21", "v12", "v13"));

	}

	public static void main(String[] args) {

		List<Sample2> superList = new ArrayList<Test.Sample2>();
		Map<String, List<SampleInner>> map = new HashMap<String, List<SampleInner>>();
		
		for(Sample sampe: samlist) {
			String key = sampe.nameA+","+sampe.nameB+","+sampe.nameC;
			if(map.get(key) == null) {
				List<SampleInner> innerList = new ArrayList<Test.SampleInner>();
				innerList.add(new SampleInner(sampe.var1, sampe.var2, sampe.var3));
				map.put(key, innerList);
			} else {
				List<SampleInner> innerList = map.get(key);
				innerList.add(new SampleInner(sampe.var1, sampe.var2, sampe.var3));
				map.put(key, innerList);
			}
		}
		Iterator<Map.Entry<String, List<SampleInner>>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, List<SampleInner>> entry = itr.next();
			String[] strLst = entry.getKey().split(",");
			Sample2 sample2 = new Sample2();
			sample2.nameA = strLst[0];
			sample2.nameB = strLst[1];
			sample2.nameC = strLst[2];
			sample2.sampleInner = entry.getValue();
			superList.add(sample2);
		}
		System.out.println(superList);
		
	}

	static class Sample {

		public Sample(String nameA, String nameB, String nameC, String var1, String var2, String var3) {
			super();
			this.nameA = nameA;
			this.nameB = nameB;
			this.nameC = nameC;
			this.var1 = var1;
			this.var2 = var2;
			this.var3 = var3;
		}

		public String nameA;
		public String nameB;
		public String nameC;
		public String var1;
		public String var2;
		public String var3;
		@Override
		public String toString() {
			return "Sample [nameA=" + nameA + ", nameB=" + nameB + ", nameC=" + nameC + ", var1=" + var1 + ", var2="
					+ var2 + ", var3=" + var3 + "]";
		}
		
		

	}
	
	static class SampleInner {

		public String var1;
		public SampleInner(String var1, String var2, String var3) {
			super();
			this.var1 = var1;
			this.var2 = var2;
			this.var3 = var3;
		}
		public String var2;
		public String var3;
		@Override
		public String toString() {
			return "SampleInner [var1=" + var1 + ", var2=" + var2 + ", var3=" + var3 + "]";
		}

		
	}

	static class Sample2 {

		public String nameA;
		public String nameB;
		public String nameC;
		public List<SampleInner> sampleInner;
		@Override
		public String toString() {
			return "Sample2 [nameA=" + nameA + ", nameB=" + nameB + ", nameC=" + nameC + ", sampleInner=" + sampleInner
					+ "]";
		}

		
	}

}
