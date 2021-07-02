package test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReadFileAndCountWords {

	public static void main(String[] args) {
		
		long wordCount = 0;
	    Path textFilePath = Paths.get("D:\\projects\\DataStructure\\src\\Steps.txt");
		try {
			Stream<String> fileLines = Files.lines(Paths.get("D:\\projects\\DataStructure\\src\\Steps.txt"));
		      wordCount = fileLines.flatMap(line -> Arrays.stream(line.split(" "))).count();
			System.out.println(wordCount);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
