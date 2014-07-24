package com.nikolavp.approval.pathmappers;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * User: nikolavp (Nikola Petrov) Date: 14-7-23 Time: 17:19
 */
public class ParentPathMapperTest {
    @Test
    public void shouldReturnAPathThatWasResolvedFromParent() throws Exception {
        final Path path = new ParentPathMapper(Paths.get("parent")).getPath("someValue", Paths.get("subpath"));

        Assert.assertThat(path, CoreMatchers.equalTo(Paths.get("parent", "subpath")));
    }
}