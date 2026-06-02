<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>ClearHealth</title>
    <meta name="description" content="Simple, transparent healthcare information page for ClearHealth." />

    <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@300;400;600;700&family=Inter:wght@300;400;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.min.css" crossorigin="anonymous" />

    <style>
        :root {
          --brand: #0077b6;
          --brand-2: #00b4d8;
          --accent-green: #8bc34a;
          --bg-light: #f9fbfd;
          --text: #0a1f33;
          --muted: #5f6c7b;
        }

        body {
          font-family: Inter, system-ui, sans-serif;
          background: linear-gradient(180deg, #e0f7fa 0%, #ffffff 100%);
          color: var(--text);
          margin: 0;
          -webkit-font-smoothing: antialiased;
          -moz-osx-font-smoothing: grayscale;
        }

        header {
          background: rgba(255, 255, 255, 0.9);
          border-bottom: 1px solid rgba(0, 119, 182, 0.1);
          position: sticky;
          top: 0;
          z-index: 10;
          backdrop-filter: blur(8px);
        }
        .nav-wrap {
          max-width: 1000px;
          margin: auto;
          display: flex;
          justify-content: space-between;
          align-items: center;
          padding: 16px 24px;
        }
        .brand {
          display: flex;
          align-items: center;
          gap: 10px;
          font-weight: 700;
          font-family: Raleway, sans-serif;
          color: var(--brand);
        }
        .brand-mark {
          width: 28px;
          height: 28px;
          border-radius: 10px;
          background: conic-gradient(from 220deg, var(--brand), var(--brand-2), var(--accent-green), var(--brand));
          box-shadow: 0 4px 10px rgba(0, 119, 182, 0.25);
        }
        nav a {
          margin-left: 18px;
          color: var(--text);
          text-decoration: none;
          font-weight: 600;
          font-size: 15px;
          line-height: 1.3;
        }
        nav a:hover { color: var(--brand-2); }
        nav a.nav-highlight {
          color: #4946C0;
          border: 1px solid rgba(79,70,229,0.25);
          padding: 6px 10px;
          border-radius: 8px;
          font-size: 15px;
          line-height: 1.3;
        }
        nav a.nav-highlight:hover { background: rgba(79,70,229,0.06); text-decoration: none; }

        main {
          max-width: 800px;
          margin: 60px auto;
          padding: 0 20px;
          text-align: center;
        }

        h1, h2, h3 {
          font-family: Raleway, sans-serif;
          color: var(--brand);
          margin-bottom: 16px;
        }

        p {
          line-height: 1.6;
          color: var(--muted);
        }

        main > p,
        main > blockquote,
        main > pre {
          max-width: 600px;
          margin-left: auto;
          margin-right: auto;
          text-align: left;
        }

        ul, ol {
          text-align: left;
          margin: 20px auto;
          max-width: 600px;
          color: var(--muted);
          line-height: 1.6;
        }

        li {
          margin-bottom: 8px;
        }

        table {
          width: 100%;
          border-collapse: collapse;
          margin: 40px 0;
          background: #fff;
          box-shadow: 0 4px 12px rgba(0,0,0,0.05);
          border-radius: 8px;
          overflow: hidden;
        }
        th, td {
          padding: 16px 20px;
          border-bottom: 1px solid rgba(0,0,0,0.05);
          line-height: 1.5;
          vertical-align: top;
        }
        th {
          background: var(--brand);
          color: #fff;
          text-align: left;
        }

        .icon {
          width: 40px;
          height: 40px;
          fill: var(--accent-green);
          margin-bottom: 12px;
        }

        footer {
          border-top: 1px solid rgba(0, 119, 182, 0.1);
          padding: 28px 24px;
          background: #fff;
          margin-top: 60px;
        }
        .foot-inner {
          max-width: 960px;
          margin: 0 auto;
          display: flex;
          flex-wrap: wrap;
          gap: 24px;
          align-items: flex-start;
          color: var(--muted);
          font-size: 0.88rem;
        }
        .foot-nav {
          display: flex;
          flex-direction: column;
          gap: 6px;
          min-width: 160px;
        }
        .foot-nav strong { color: var(--text); font-size: 0.8rem; text-transform: uppercase; letter-spacing: 0.06em; }
        .foot-nav a { color: var(--muted); text-decoration: none; }
        .foot-nav a:hover { color: var(--brand-2); }
        .foot-inner small { display: block; width: 100%; color: var(--muted); }

        @media (max-width: 600px) {
          main { margin: 40px auto; }
          nav a { margin-left: 10px; font-size: 15px; }
          ul, ol { max-width: 100%; padding-left: 20px; }
        }
        table th:first-child,
          table td:first-child {
            padding-left: 20px;
            padding-inline-start: 20px;
          }
    </style>
</head>
<body>
<header>
    <div class="nav-wrap">
        <div class="brand"><span class="brand-mark"><img src="./images/logo.png" alt="ClearHealth Logo"></span><span>Clear<strong>Health</strong></span></div>
        <nav>
            <a href="index.html">Home</a>
            <a href="concept.html">The Plan</a>
            <a href="pricing.html">Pricing</a>
            <a href="provider-introduction.html">For Providers</a>
            <a href="investor-overview.html" class="nav-highlight">Investor Overview</a>
        </nav>
    </div>
</header>
<main>
    ${content}
</main>
<footer>
    <div class="foot-inner">
        <div class="foot-nav">
            <strong>Members:</strong>
            <a href="concept.html">How it Works</a>
            <a href="prescription-strategy.html">Prescriptions</a>
            <a href="claims.html">Claims</a>
            <a href="concierge-integration.html">Concierge &amp; DPC</a>
        </div>
        <div class="foot-nav">
            <strong>Providers:</strong>
            <a href="provider-introduction.html">Get Started</a>
            <a href="provider-perspective.html">Billing &amp; Payments</a>
        </div>
        <div class="foot-nav">
            <strong>Entrepreneurs:</strong>
            <a href="investor-overview.html">Executive Summary</a>
            <a href="launch-blueprint.html">Launch Blueprint</a>
            <a href="pricing.html">Business Model</a>
        </div>
        <small>© <span id="year"></span> ClearHealth</small>
    </div>
</footer>
<script>document.getElementById('year').textContent = new Date().getFullYear();</script>
</body>
</html>
