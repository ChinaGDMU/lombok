import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import lombok.Singular;
@lombok.Builder class BuilderSingletonGuavaListsSets<T> {
  public static @java.lang.SuppressWarnings("all") class BuilderSingletonGuavaListsSetsBuilder<T> {
    private com.google.common.collect.ImmutableList.Builder<T> cards;
    private com.google.common.collect.ImmutableList.Builder<Number> frogs;
    private com.google.common.collect.ImmutableSet.Builder<java.lang.Object> rawSet;
    private com.google.common.collect.ImmutableSortedSet.Builder<String> passes;
    @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSetsBuilder() {
      super();
    }
    public @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSetsBuilder<T> card(T card) {
      if ((this.cards == null))
          this.cards = com.google.common.collect.ImmutableList.builder();
      this.cards.add(card);
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSetsBuilder<T> cards(java.lang.Iterable<? extends T> cards) {
      if ((this.cards == null))
          this.cards = com.google.common.collect.ImmutableList.builder();
      this.cards.addAll(cards);
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSetsBuilder<T> frog(Number frog) {
      if ((this.frogs == null))
          this.frogs = com.google.common.collect.ImmutableList.builder();
      this.frogs.add(frog);
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSetsBuilder<T> frogs(java.lang.Iterable<? extends Number> frogs) {
      if ((this.frogs == null))
          this.frogs = com.google.common.collect.ImmutableList.builder();
      this.frogs.addAll(frogs);
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSetsBuilder<T> rawSet(java.lang.Object rawSet) {
      if ((this.rawSet == null))
          this.rawSet = com.google.common.collect.ImmutableSet.builder();
      this.rawSet.add(rawSet);
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSetsBuilder<T> rawSet(java.lang.Iterable<?> rawSet) {
      if ((this.rawSet == null))
          this.rawSet = com.google.common.collect.ImmutableSet.builder();
      this.rawSet.addAll(rawSet);
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSetsBuilder<T> pass(String pass) {
      if ((this.passes == null))
          this.passes = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.passes.add(pass);
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSetsBuilder<T> passes(java.lang.Iterable<? extends String> passes) {
      if ((this.passes == null))
          this.passes = com.google.common.collect.ImmutableSortedSet.naturalOrder();
      this.passes.addAll(passes);
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSets<T> build() {
      com.google.common.collect.ImmutableList<T> cards = ((this.cards == null) ? com.google.common.collect.ImmutableList.of() : this.cards.build());
      com.google.common.collect.ImmutableCollection<Number> frogs = ((this.frogs == null) ? com.google.common.collect.ImmutableList.of() : this.frogs.build());
      com.google.common.collect.ImmutableSet<java.lang.Object> rawSet = ((this.rawSet == null) ? com.google.common.collect.ImmutableSet.of() : this.rawSet.build());
      com.google.common.collect.ImmutableSortedSet<String> passes = ((this.passes == null) ? com.google.common.collect.ImmutableSortedSet.of() : this.passes.build());
      return new BuilderSingletonGuavaListsSets<T>(cards, frogs, rawSet, passes);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") java.lang.String toString() {
      return (((((((("BuilderSingletonGuavaListsSets.BuilderSingletonGuavaListsSetsBuilder(cards=" + this.cards) + ", frogs=") + this.frogs) + ", rawSet=") + this.rawSet) + ", passes=") + this.passes) + ")");
    }
  }
  private @Singular ImmutableList<T> cards;
  private @Singular ImmutableCollection<? extends Number> frogs;
  private @SuppressWarnings("all") @Singular("rawSet") ImmutableSet rawSet;
  private @Singular ImmutableSortedSet<String> passes;
  @java.lang.SuppressWarnings("all") BuilderSingletonGuavaListsSets(final ImmutableList<T> cards, final ImmutableCollection<? extends Number> frogs, final ImmutableSet rawSet, final ImmutableSortedSet<String> passes) {
    super();
    this.cards = cards;
    this.frogs = frogs;
    this.rawSet = rawSet;
    this.passes = passes;
  }
  public static @java.lang.SuppressWarnings("all") <T>BuilderSingletonGuavaListsSetsBuilder<T> builder() {
    return new BuilderSingletonGuavaListsSetsBuilder<T>();
  }
}