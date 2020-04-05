package ua.lviv.iot.accessories.manager;

import java.util.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import ua.lviv.iot.accessories.model.Accessory;

public class ProductWriter {
	private Writer csvWriter = new StringWriter();

	public Writer getCsvWriter() {
		return csvWriter;
	}

	public void setCsvWriter(Writer csvWriter) {
		this.csvWriter = csvWriter;
	}

	@Override
	public String toString() {
		return csvWriter.toString();
	}

	public void writeToFile(List<Accessory> accessories) throws IOException {
		csvWriter.write(accessories.get(0).getHeaders());
		csvWriter.write("\n");
		for (Accessory accessory : accessories) {
			csvWriter.write(accessory.toCSV());
			csvWriter.write("\n");
		}
		
		csvWriter.flush();
	}
}
