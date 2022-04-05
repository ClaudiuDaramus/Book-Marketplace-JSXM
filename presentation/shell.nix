let
    pkgs = import (fetchTarball("https://github.com/NixOS/nixpkgs/archive/573095944e7c1d58d30fc679c81af63668b54056.tar.gz")) {};
in pkgs.mkShell {
    name = "pandoc-beamer-environment";
    buildInputs = [
        pkgs.pandoc
        pkgs.texlive.combined.scheme-full
    ];
    shellHook = ''source ~/.bashrc'';
}
