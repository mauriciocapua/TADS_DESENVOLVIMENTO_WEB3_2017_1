package web3_06032017;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Decoder {

	public List<String> readSmallTextFile(String aFileName) throws IOException {
		return Files.readAllLines(Paths.get(aFileName), StandardCharsets.UTF_8);
	}
}
