<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>ClearHealth — Healthcare, Reimagined</title>
    <meta name="description" content="Simple, transparent coverage with cash-first pricing and Medicare+20% caps. No surprises. Just care." />

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@300;400;600;700&family=Inter:wght@300;400;600;700&display=swap" rel="stylesheet">
    <!-- Skeleton (optional – keeps your grid/utilities) -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton/2.0.4/skeleton.min.css" integrity="sha512-EZLkOqw8J9f8dXv8c3nGZfFZ9nN9G5r6S6zC3A5xJX2mO3m8J5i9n7r1r1e2P0U2vE3k0zR3y8k0Q0j0h3q8Jw==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    <style>
        :root{
          --bg: #0f1221;
          --ink: #12131a;
          --text: #0f1120;
          --muted: #6b7280;
          --brand: #00b4d8; /* Bright aqua */
          --brand-2: #90e0ef;    /* Sky blue */
          --brand-3: #8bc34a;     /* peaceful green */
          --surface: rgba(255,255,255,0.06);
          --card: #ffffff;
          --ink-2: #1f2937;
          --ok: #10b981;
          --warn: #f59e0b;
          --danger: #ef4444;
        }

        /* Global reset tweaks */
        html, body { height: 100%; }
        body{
          font-family: Inter, system-ui, -apple-system, Segoe UI, Roboto, Helvetica, Arial, "Apple Color Emoji", "Segoe UI Emoji";
          color: #0b0d18;
          background: radial-gradient(1200px 800px at 10% -10%, rgba(79,70,229,0.25), transparent 60%),
                      radial-gradient(1000px 600px at 90% 10%, rgba(34,211,238,0.22), transparent 55%),
                      linear-gradient(180deg, #fbfbff 0%, #f6f8ff 100%);
          -webkit-font-smoothing: antialiased;
          -moz-osx-font-smoothing: grayscale;
        }

        a{ color: var(--brand); text-decoration: none; }
        a:hover{ text-decoration: underline; }

        /* Header / Nav */
        .site-header{
          position: sticky; top:0; z-index: 10;
          backdrop-filter: blur(8px);
          background: rgba(255,255,255,0.75);
          border-bottom: 1px solid rgba(15, 17, 32, 0.06);
        }
        .nav-wrap {
          max-width: 1000px;
          margin: auto;
          display: flex;
          justify-content: space-between;
          align-items: center;
          padding: 16px 24px;
        }
        .brand{ display:flex; gap:10px; align-items:center; font-weight:700; letter-spacing:0.2px; }
        .brand-mark{ width:28px; height:28px; border-radius:10px; background: conic-gradient(from 220deg, var(--brand), var(--brand-2), var(--brand-3), var(--brand)); box-shadow: 0 6px 20px rgba(79,70,229,0.35); }
        .brand span{ font-family: Raleway, Inter, sans-serif; font-weight:700; }
        .nav a {
          margin-left: 18px;
          font-weight: 600;
          color: var(--text);
          font-size: 0.95rem;           /* new */
          font-family: Inter, system-ui, sans-serif;
        }
        .nav a:hover {
          color: var(--brand-2);        /* matches template hover */
        }
        .nav .cta{ background: var(--brand); color:white; padding:10px 14px; border-radius:12px; box-shadow: 0 6px 16px rgba(79,70,229,0.35); }
        .nav .cta:hover{ text-decoration:none; filter: brightness(1.05); }
        .nav {
          display: flex;
          align-items: center;
          flex-wrap: wrap;   /* lets items wrap on small screens */
        }

        /* Hero */
        .hero{ position:relative; max-width:1100px; margin: 0 auto; padding: 72px 24px 48px; text-align:center; }
        .hero h1{ font-family: Raleway, Inter, sans-serif; font-size: clamp(2rem, 4.5vw, 3.25rem); line-height:1.1; margin-bottom: 14px; }
        .hero h1 .accent{ background: linear-gradient(90deg, var(--brand), var(--brand-2)); -webkit-background-clip: text; background-clip: text; color: transparent; }
        .hero p{ color:#384152; font-size: clamp(1rem, 2.2vw, 1.2rem); max-width: 760px; margin: 0 auto 28px; }
        .hero-cta{ display:flex; gap:12px; align-items:center; justify-content:center; flex-wrap:wrap; }
        .button{ display:inline-block; padding:12px 18px; border-radius:14px; font-weight:700; border:1px solid rgba(15,17,32,0.1); }
        .button.primary{ background: linear-gradient(90deg, var(--brand), var(--brand-2)); color:#fff; border:none; box-shadow: 0 10px 24px rgba(79,70,229,0.25); }
        .button.ghost{ background:#fff; color:#111; }

        /* Glass stats */
        .stats{
          display:grid; grid-template-columns: repeat(3,1fr); gap:16px; margin: 36px auto 4px; max-width: 900px;
        }
        .stat{
          background: rgba(255,255,255,0.55);
          backdrop-filter: blur(6px);
          border: 1px solid rgba(15,17,32,0.08);
          border-radius: 16px; padding: 18px 16px;
        }
        .stat strong{ font-size: 1.35rem; display:block; }
        .stat span{ color: var(--muted); font-size: 0.95rem; }

        /* Value props */
        .section{ max-width: 1100px; margin: 72px auto; padding: 0 24px; }
        .section h2{ font-family: Raleway, Inter, sans-serif; font-size: clamp(1.6rem, 3vw, 2.05rem); margin-bottom: 18px; }
        .lead{ color:#4b5563; max-width: 760px; }
        .grid-3{ display:grid; grid-template-columns: repeat(3, 1fr); gap: 18px; margin-top: 28px; }
        .card{
          background:#fff; border:1px solid rgba(15,17,32,0.06); border-radius: 18px; padding: 22px; box-shadow: 0 8px 24px rgba(9,11,20,0.05);
        }
        .card h3{ margin-top:10px; }
        .icon{ width:24px; height:24px; }

        /* How it works */
        .steps{ display:grid; grid-template-columns: repeat(3, 1fr); gap: 22px; margin-top: 28px; }
        .step{ background: linear-gradient(180deg, #ffffff, #fbfbff); border:1px solid rgba(15,17,32,0.06); border-radius: 18px; padding: 22px; }
        .step .num{ width: 36px; height:36px; border-radius: 12px; display:inline-flex; align-items:center; justify-content:center; font-weight:800; color:white; background: linear-gradient(135deg, var(--brand), var(--brand-2)); box-shadow: 0 6px 16px rgba(34,211,238,0.25); }

        /* Link shelf */
        .link-shelf{ display:grid; grid-template-columns: repeat(2, 1fr); gap: 12px; margin-top: 16px; }
        .link-tile{ border-radius: 14px; padding: 14px 16px; border:1px solid rgba(15,17,32,0.07); background:#fff; display:flex; justify-content:space-between; align-items:center; }
        .link-tile span{ color:#4b5563; }

        /* Plain-English Explainer */
        .explainer-section { margin-top: 0; }
        .explainer-box {
          background: linear-gradient(135deg, rgba(0,180,216,0.07), rgba(139,195,74,0.06));
          border: 1px solid rgba(0,180,216,0.2);
          border-radius: 20px;
          padding: 36px 40px;
        }
        .explainer-box h2 { margin-bottom: 10px; }
        .explainer-box > p { color: #384152; margin-bottom: 24px; }
        .explainer-steps { display: flex; flex-direction: column; gap: 14px; margin-bottom: 20px; }
        .explainer-step { display: flex; gap: 16px; align-items: flex-start; text-align: left; }
        .explainer-num {
          min-width: 30px; height: 30px; border-radius: 50%;
          background: linear-gradient(135deg, var(--brand), var(--brand-2));
          color: #fff; font-weight: 800; font-size: 0.85rem;
          display: inline-flex; align-items: center; justify-content: center;
          flex-shrink: 0; margin-top: 2px;
        }
        .explainer-step div { color: #273146; font-size: 0.98rem; line-height: 1.55; }
        .explainer-step strong { color: #0f1120; }
        .explainer-bottom { color: var(--muted); font-style: italic; margin: 0; font-size: 0.95rem; }

        /* Learn tracks */
        .learn-tracks { display: flex; flex-direction: column; gap: 28px; margin-top: 28px; }
        .learn-track { }
        .track-label {
          font-size: 0.78rem; font-weight: 700; letter-spacing: 0.08em; text-transform: uppercase;
          margin-bottom: 10px; padding: 4px 10px; border-radius: 6px; display: inline-block;
        }
        .member-label { background: rgba(0,180,216,0.1); color: #007FA8; }
        .investor-label { background: rgba(79,70,229,0.1); color: #4946C0; }
        .featured-tile {
          border-color: rgba(79,70,229,0.3) !important;
          background: linear-gradient(90deg, rgba(79,70,229,0.05), rgba(34,211,238,0.05)) !important;
        }
        .featured-tile span { color: #3730a3 !important; font-weight: 600; }

        /* CTAs */
        .cta-band{ margin: 72px 0; }
        .cta-inner{ max-width:980px; margin:0 auto; padding: 28px; border-radius: 18px; background: linear-gradient(90deg, rgba(79,70,229,0.12), rgba(34,211,238,0.12)); border:1px solid rgba(79,70,229,0.25);
          display:flex; gap:18px; align-items:center; justify-content:space-between; flex-wrap:wrap; }
        .cta-inner p{ margin:0; color:#273146; }
        .cta-split { flex-direction: row; align-items: stretch; gap: 0; padding: 0; overflow: hidden; }
        .cta-block { flex: 1; padding: 28px 32px; display: flex; flex-direction: column; gap: 10px; }
        .cta-block p { margin: 0; }
        .cta-eyebrow { font-size: 0.75rem; font-weight: 700; letter-spacing: 0.08em; text-transform: uppercase; color: var(--muted) !important; }
        .cta-divider { width: 1px; background: rgba(79,70,229,0.2); flex-shrink: 0; }

        /* Footer */
        footer{ border-top:1px solid rgba(15,17,32,0.06); padding:28px 24px; background:#fff; }
        .foot{ max-width:1100px; margin:0 auto; display:flex; align-items:center; justify-content:space-between; flex-wrap:wrap; gap:12px; color:#6b7280; }

        /* Responsive */
        @media (max-width: 960px){
          .grid-3, .steps { grid-template-columns: 1fr; }
          .stats { grid-template-columns: 1fr; }
          .link-shelf{ grid-template-columns: 1fr; }
          .nav a {
            margin-left: 8px;
            font-size: 0.95rem;
          }
          .nav .cta {
            padding: 4px 8px;  /* smaller button on phones */
            border-radius: 6px;
          }
          .cta-split { flex-direction: column; }
          .cta-divider { width: auto; height: 1px; }
          .explainer-box { padding: 24px 20px; }
        }
/* Stack header items vertically on small screens */
        @media (max-width: 640px){
          .nav-wrap {
            flex-direction: column;
            align-items: flex-start;
            gap: 8px;
          }
          .nav {
            width: 100%;
            flex-direction: column;
            align-items: flex-start;
            gap: 6px;
          }
          .nav a {
            margin-left: 0;        /* remove inline margin */
            display: block;        /* stack links vertically */
            padding: 8px 0;        /* vertical tap targets */
            font-size: 0.95rem;    /* readable on mobile */
          }
          .nav .cta {
            align-self: flex-start; /* keep CTA aligned with links */
          }
        }
    </style>
</head>
<body>
${content}
</body>
</html>
