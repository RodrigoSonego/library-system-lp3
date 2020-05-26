package br.com.acme.model;

import java.util.ArrayList;

public class AcademicLibrary implements ILibrary {

    private String name;
    private String description;
    private String creationDate;
    private ArrayList<Publication> publications;
    private ArrayList<User> users;

    public AcademicLibrary(String name, String description, String creationDate) {
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.publications = new ArrayList<>();
        this.users = new ArrayList<>();
    }


    public ArrayList<User> getUsers() {
        return users;
    }

    @Override
    public void addPublication(Publication p) {
        publications.add(p);
    }

    @Override
    public boolean removePublication(long id) {
        for (Publication p : publications) {
            if (p instanceof Article) {
                Article a = (Article) p;
                if (a.getIssn() == id) {
                    return publications.remove(a);
                }
            } else if (p instanceof Book) {
                Book b = (Book) p;
                if (b.getIsbn() == id) {
                    return publications.remove(b);
                }
            }
        }
        return false;
    }

    @Override
    public ArrayList<Publication> getAllPublications() {
        return publications;
    }

    @Override
    public short countPublications() {
        return (short) publications.size();
    }

    @Override
    public Publication findPublication(String title) {
        for (Publication p : publications) {
            if (p.getTitle().equalsIgnoreCase(title)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean hasPublication(String title) {
        if (findPublication(title) != null) {
            return true;
        }
        return false;
    }

    public short countArticles() {
        short count = 0;
        for (Publication p : publications) {
            if (p instanceof Article) {
                count++;
            }
        }
        return count;
    }

    public short countBooks() {
        short count = 0;
        for (Publication p : publications) {
            if (p instanceof Book) {
                count++;
            }
        }
        return count;
    }

    public Article findArticle(long issn) {
        for (Publication p : publications) {
            if (p instanceof Article) {
                Article a = (Article) p;
                if (a.getIssn() == issn) {
                    return a;
                }
            }
        }
        return null;
    }

    public Article findArticle(String title) {
        for (Publication p : publications) {
            if (p instanceof Article) {
                Article a = (Article) p;
                if (a.getTitle().equalsIgnoreCase(title)) {
                    return a;
                }
            }
        }
        return null;
    }

    public Book findBook(long isbn) {
        for (Publication p : publications) {
            if (p instanceof Book) {
                Book b = (Book) p;
                if (b.getIsbn() == isbn) {
                    return b;
                }
            }
        }
        return null;
    }

    public Book findBook(String title) {
        for (Publication p : publications) {
            if (p instanceof Book) {
                Book b = (Book) p;
                if (b.getTitle().equalsIgnoreCase(title)) {
                    return b;
                }
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
