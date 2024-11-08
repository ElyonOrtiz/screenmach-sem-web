package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    DRAMA("Drama", "Drama"),
    COMEDIA("Comedy", "Comédia"),
    ROMANCE("Romance", "Romance"),
    TERROR("Horror", "Terror"),
    INFANTIL("Children", "Infantil"),
    ANIMACAO("Animation", "Animação"),
    FICCAO("Fiction", "Ficção"),
    DOCUMENTARIO("Documentary", "Documentário"),
    SUSPENSE("Suspense", "Suspense"),
    FAMILIA("Family", "Familia"),
    MISTERY("Mystery", "Misterio"),
    THRILLER("Thriller", "Thriller"),
    ANIME("Anime", "Anime"),
    AVENTURA("Adventure", "Aventura"),
    FANTASIA("Fantasy", "Fantasia"),
    CRIME("Crime", "Crime"),;

    private String categoriaPortugues;


    private String categoriaOmdb;

    Categoria(String categoriaOmdb, String categoriaPortugues) {
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortugues = categoriaPortugues;
    }
    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
    public static Categoria fromPortugues(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

}
