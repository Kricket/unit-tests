package com.ineat.academy.unittests.util;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NameReader {
    /**
     * Search a file containing a list of names, for those whose last name starts with the given prefix.
     * @param filename A file containing one name per line, of the form "firstname lastname"
     * @param prefix The prefix of the last name to search for
     * @return Matching names
     * @throws IOException If the given file could not be read
     */
    public List<String> readNamesStartingWith(
            final String filename,
            final String prefix) throws IOException {
        final List<String> lines = IOUtils.readLines(new FileReader(filename));
        return lines.stream()
                .filter(line -> line.trim().contains(" " + prefix))
                .collect(Collectors.toList());
    }
}
