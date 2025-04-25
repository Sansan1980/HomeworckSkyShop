package org.skypro.skyshop.article;

import org.skypro.skyshop.product.Searchable;

import java.util.Objects;

public final class Article implements Searchable {
    private final String nameTheArticle;
    private final String textTheArticle;

    public Article(String nameTheArticle, String textTheArticle) {
        this.nameTheArticle = nameTheArticle;
        this.textTheArticle = textTheArticle;
    }

    public String getNameTheArticle() {
        return nameTheArticle;
    }

    public String getTextTheArticle() {
        return textTheArticle;
    }
    public String searchTerm() {
        return nameTheArticle + ": " + textTheArticle;
    }

    public String extractionTheType() {
        return "ARTICLE";
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article article)) return false;
        return Objects.equals(getNameTheArticle(), article.getNameTheArticle()) && Objects.equals(getTextTheArticle(), article.getTextTheArticle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameTheArticle(), getTextTheArticle());
    }

    @Override
    public String toString() {
        return "Article{" +
                "nameTheArticle='" + nameTheArticle + '\'' +
                ", textTheArticle='" + textTheArticle + '\'' +
                '}';
    }
}
