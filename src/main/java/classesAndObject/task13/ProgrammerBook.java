package classesAndObject.task13;

import classesAndObject.task12.Book;

import java.text.MessageFormat;

/**
 * @author e.ivanov {@link 'https://github.com/EugeneOwl'}
 */
public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(final int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return MessageFormat.format(
                "{0}, language '{1}', level = {2}",
                super.toString(), language, level
        );
    }

    @Override
    public boolean equals(final Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        final ProgrammerBook programmerBook = (ProgrammerBook)obj;
        return programmerBook.language.equals(language)
                && programmerBook.level == level;
    }
}