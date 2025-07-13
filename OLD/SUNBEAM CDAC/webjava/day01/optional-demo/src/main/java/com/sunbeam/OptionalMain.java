package com.sunbeam;

import java.util.Optional;

public class OptionalMain {
	public static void main(String[] args) {
		//Optional<String> opt = Optional.of("Sunbeam");
		Optional<String> opt = Optional.empty();
	
		if(opt.isPresent())
			System.out.println("Data: " + opt.get());
		else
			System.out.println("No Data Available");
		
		String data = opt.orElse("Default");
		System.out.println("Data: " + data);
		
		opt.ifPresent((d) -> System.out.println("Data: " + d));
		
		data = opt.orElseThrow(() -> new RuntimeException("No Data"));
		System.out.println("Data: " + data);
		System.out.println("Bye!");
	}
}
