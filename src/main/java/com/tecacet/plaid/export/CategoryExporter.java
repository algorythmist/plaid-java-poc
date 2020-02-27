package com.tecacet.plaid.export;

import com.plaid.client.response.CategoriesGetResponse;
import com.tecacet.jflat.CSVWriter;

import org.apache.commons.csv.CSVFormat;

import java.io.IOException;
import java.util.List;

public class CategoryExporter {

    private static final String[] HEADER = {"Category Id", "Group", "Hierarchy"};
    private static final String[] PROPERTIES = {"categoryId", "group", "hierarchy"};

    public void exportCategories(List<CategoriesGetResponse.Category> categories, String filename) throws IOException {

        CSVWriter writer = CSVWriter.createForProperties(PROPERTIES)
                //.withFormat(CSVFormat.RFC4180.withQuote('"'))
                .withHeader(HEADER);
        writer.writeToFile(filename, categories);
    }
}
