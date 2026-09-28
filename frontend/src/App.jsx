import "./App.css";

function App() {
  return (
    <main className="site">

      {/* HERO */}
      <section className="hero">

        <header className="header">
          <div className="logo">
            <span>WILDFRAME</span>
            <span className="logo-shadow">WILDFRAME</span>
          </div>

          <nav>
            <a href="#adventure">Adventure</a>
            <a href="#highlight">Highlight</a>
            <a href="#video">Video</a>
            <a href="#contact">Contact</a>
          </nav>
        </header>

        <div className="hero-image">
          <div className="adventure-info">
            <span>24</span>
            <span>SEPTEMBER</span>
            <span>2026</span>
            <span>IST +05:30</span>

            <div className="adventure-line"></div>

            <strong>UPCOMING</strong>
            <strong>ADVENTURE</strong>
          </div>
        </div>

        <div className="hero-title">
          <p>WILDLIFE • FILM • PHOTOGRAPHY</p>
          <h1>
            WILD
            <br />
            STORIES.
          </h1>
        </div>

      </section>


      {/* TODAY'S HIGHLIGHT */}
      <section className="highlight" id="highlight">

        <div className="section-label">
          TODAY'S
          <br />
          HIGHLIGHT
        </div>

        <div className="highlight-card">
          <p className="small-label">FIELD NOTE / 001</p>

          <h2>Into the Wild</h2>

          <p>
            A glimpse into the places, creatures and stories
            that make the natural world extraordinary.
          </p>

          <button>READ STORY →</button>
        </div>

      </section>


      {/* LATEST VIDEO */}
      <section className="video-section" id="video">

        <div className="section-heading">
          <span>LATEST</span>
          <h2>VIDEO</h2>
        </div>

        <div className="video-placeholder">
          <div className="play-button">▶</div>

          <div className="video-text">
            <p>WILDFRAME FILMS</p>
            <h3>Tiger at Golden Hour</h3>
          </div>
        </div>

      </section>


      {/* CONTACT */}
      <section className="contact" id="contact">

        <div>
          <p>GET IN TOUCH</p>
          <h2>ME<br />CONTACTER</h2>
        </div>

        <div className="contact-details">
          <a href="mailto:hello@wildframe.com">
            hello@wildframe.com
          </a>

          <a href="tel:+910000000000">
            +91 00000 00000
          </a>
        </div>

      </section>


      <footer>
        <span>WILDFRAME © 2026</span>
        <span>WILDLIFE / STORIES / ADVENTURE</span>
      </footer>

    </main>
  );
}

export default App;